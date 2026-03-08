import numpy as np

# ==============================
# INPUT DATA
# ==============================
def input_matriks():
    n = int(input("Masukkan jumlah variabel: "))

    print("\nMasukkan persamaan (koefisien + hasil)")
    print("Contoh untuk 2 variabel:")
    print("5 1 1 23  → artinya 5x + 1y + 1z = 23")
    print("-" * 40)

    A = []

    for i in range(n):
        row = list(map(float, input(f"Persamaan {i+1}: ").split())) # nah jadi split itu fungsinya untuk membeda string , map fungsinya mengubah string jadi desimal, list adalah aray
        A.append(row)

    return np.array(A, dtype=float), n


# ==============================
# CETAK MATRIKS
# ==============================
def cetak_matriks(M):
    print("\nMatriks sekarang:")
    print(M)


# ==============================
# GAUSS JORDAN SEDERHANA
# ==============================
def gauss_jordan(M, n):

    for i in range(n):

        # 1️⃣ Ambil pivot (angka diagonal)
        pivot = M[i][i]

        # Jika pivot 0, tidak bisa lanjut
        if pivot == 0:
            print("Pivot 0! Tidak bisa lanjut.")
            return None

        # 2️⃣ Bagi satu baris supaya pivot jadi 1
        M[i] = M[i] / pivot
        print(f"\nBagi baris {i+1} dengan {pivot}")
        cetak_matriks(M)

        # 3️⃣ Nolkan kolom selain pivot
        for j in range(n):
            if j != i:
                faktor = M[j][i]
                M[j] = M[j] - faktor * M[i]
                print(f"\nEliminasi baris {j+1}")
                cetak_matriks(M)

    return M


# ==============================
# PROGRAM UTAMA
# ==============================
def main():
    A, n = input_matriks()

    print("\nMatriks Awal:")
    cetak_matriks(A)

    hasil = gauss_jordan(A, n)

    if hasil is None:
        return

    print("\nHasil Akhir:")
    solusi = hasil[:, -1]

    for i in range(n):
        print(f"x{i+1} = {solusi[i]:.4f}")


if __name__ == "__main__":
    main()