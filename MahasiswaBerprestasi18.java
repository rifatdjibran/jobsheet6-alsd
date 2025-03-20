// Rifat Djibran
public class MahasiswaBerprestasi18 {
    Mahasiswa18[] listMhs = new Mahasiswa18[5]; 

    void tambah(int index, Mahasiswa18 m) {
        if (index < listMhs.length) {
            listMhs[index] = m;
        }
    }

    void tampil() {
        for (Mahasiswa18 m : listMhs) {
            m.tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    Mahasiswa18 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) { 
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) { 
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            } 
            
            Mahasiswa18 tmp = listMhs[idxMin]; 
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa18 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
