public int FindBinarySearch(String cari, int left, int right) {
    if (right >= left) {
        int mid = (left + right) / 2;

        if (listMhs[mid].id.equals(cari)) {
            return mid;
        } else if (listMhs[mid].id.compareTo(cari) > 0) {
            return FindBinarySearch(cari, left, mid - 1);
        } else {
            return FindBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
}