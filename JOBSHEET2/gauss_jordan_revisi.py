import numpy as np

RED = "\033[31m"
GREEN = "\033[32m"
YELLOW = "\033[33m"
BLUE = "\033[34m"
CYAN = "\033[36m"
WHITE = "\033[37m"
RESET = "\033[0m"

print(CYAN + "=" *50)
print("WELCOME TO CALCULATE GAUSS SHEVA CIHUYYY")
print("=" *50 + RESET)


def input_matriks():
    while True:
        try:
            n = int(input(YELLOW + "Masukkan jumlah variabel: " + RESET))
            if n < 2:
                print(RED + "Minimal 2 variabel" + RESET)
                continue
            break
        except ValueError:
            print(RED + "Input Invalid" + RESET)

    print("\nMasukkan persamaan (koefisien + hasil)")
    print("Contoh 3 variabel:")
    print("5 1 1 23  → 5x + 1y + 1z = 23")
    print("-" * 40)

    A = []

    for i in range(n):
        while True:
            try:
                row = list(map(float, input(YELLOW + f"Persamaan {i+1}: " + RESET).split()))
                if len(row) != n + 1:
                    print(RED + f"Harus ada {n+1} angka" + RESET)
                    continue
                A.append(row)
                break
            except ValueError:
                print(RED + "Invalid Value" + RESET)

    return np.array(A, dtype=float), n


def cetak_matriks(M, n):
    header = ""
    for i in range(n):
        huruf = chr(88 + i)
        header += f"{huruf}  "
    header += "| Hasil"

    print(WHITE + "\n" + header)
    print("-" * (len(header) + 5))
    print(M, RESET)


def gauss_jordan(M, n):

    for i in range(n):

        pivot = M[i][i]


        if pivot == 0:
            for k in range(i+1, n):
                if M[k][i] != 0:
                    M[[i, k]] = M[[k, i]]
                    print(BLUE + f"\nSwap baris {i+1} dengan {k+1}" + RESET)
                    cetak_matriks(M, n)
                    pivot = M[i][i]
                    break

  
        if pivot == 0:
            print(RED + "Tidak ada pivot yang bisa dipakai" + RESET)
            return None

       
        M[i] = M[i] / pivot
        print(BLUE + f"\nBagi baris {i+1} dengan {pivot}" + RESET)
        cetak_matriks(M, n)

       
        for j in range(n):
            if j != i:
                faktor = M[j][i]
                M[j] = M[j] - faktor * M[i]

                M[abs(M) < 1e-10] = 0

                print(BLUE + f"\nEliminasi baris {j+1}" + RESET)
                cetak_matriks(M, n)


    for i in range(n):
        if np.all(M[i, :-1] == 0) and M[i, -1] != 0:
            print(RED + "\nSistem tidak memiliki solusi (Inconsistent System)" + RESET)
            return None

        if np.all(M[i] == 0):
            print(YELLOW + "\nSistem memiliki solusi tak hingga (Infinite Solutions)" + RESET)
            return None

    return M
def main():

    while True:

        A, n = input_matriks()

        print(CYAN + "\nMatriks Awal:" + RESET)
        cetak_matriks(A, n)

        hasil = gauss_jordan(A, n)

        if hasil is None:
            print(RED + "\nSistem tidak valid. Silakan input ulang persamaan.\n" + RESET)
            continue

        print(GREEN + "\nHasil Akhir:" + RESET)
        solusi = hasil[:, -1]

        for i in range(n):
            huruf = chr(88 + i)
            print(GREEN + f"{huruf} = {solusi[i]:.2f}" + RESET)

        break

if __name__ == "__main__":
    main()