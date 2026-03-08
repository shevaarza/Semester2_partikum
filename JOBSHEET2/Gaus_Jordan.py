import numpy as np

A = np.array([
    [5, 2, 1, 27],
    [2, 4, 1, 19],
    [1, 1, 6, 24]
], dtype=float)

B = A.copy()

pembagi1 = A[0][0]

B[0] = B[0] / pembagi1 

print("Matriks A:")
print(A)

print("\nMatriks B (hasil pembagian baris pertama):")
print(B)

P1 = B[1][0] / B[0][0]

B[1] = B[1] - (P1 * B[0])


print("\nMatriks B (hasil pembagian baris kedua):")
print(B)

P2 = B[2][0] / B[0][0]
print(B[2][0])
B[2] = B[2] - (P2 * B[0])

print("\nMatriks B (hasil pembagian baris ketiga):")
print(B)

pembagi2 = B[1][1]
for j in range (1 , 4):
    B[1][j] = B[1][j] /pembagi2
    
print("\nMatriks B (hasil pembagian baris keempat):")
print(B)

P3 = B[2][1] /B[1][1]
print(P3)
for j in range (1 ,4):
    # print(B[0][j])
    # print(B[2][j])
    var1 = P3 * B[1][j]
    print(var1)
    B[2][j] = B[2][j] - var1
    
print("\nMatriks B (hasil pembagian baris kelima):")
print(B)

pembagi3 = B[2][2]

for j in range (2 ,4):
    B[2][j] = B[2][j] /pembagi3

print("\nMatriks B (hasil pembagian baris keenam):")
print(B)

P4 = B[1][2] /B[2][2]

for j in range(2,4):
    B[1][j] = B[1][j] -(P4 * B[2][j])

print("\nMatriks B (hasil pembagian baris ketujuh):")
print(B)

P5 = B[0][2] / B[2][2]

for j in range (3 ,0 ,-1):
    B[0][j] = B[0][j] - P5 * B[2][j]

print("\nMatriks B (hasil pembagian baris kedelapan):")
print(B)

P6 = B[0][1] / B[1][1]

for j in range (3 ,0 , -1):
    B[0][j] = B[0][j] - P6 * B[1][j]

print("\nMatriks B (hasil pembagian baris kesembilan):")
print(B)
print("\n")
print("---------------------")
print("Hasil Akhir")
print("---------------------\n")

X = B[0][3]
Y = B[1][3]
Z = B[2][3]

print("----------------------------")
print("Hasil solusi sistem persamaan:")
print(f"X = {X:.2f}")
print(f"Y = {Y:.2f}")
print(f"Z = {Z:.2f}")