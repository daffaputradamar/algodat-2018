package Project;

import java.util.Random;

public class Minesweeper {

    Kotak[][] peta;
    int jmlBom;

    public Minesweeper() {
        peta = new Kotak[6][6];
        jmlBom = 3;
    }

    void resetPeta() {
        for (int i = 0; i < peta.length; i++) {
            for (int j = 0; j < peta[i].length; j++) {
                peta[i][j] = new Kotak();
                peta[i][j].nilai = 0;
            }
        }
    }

    Random rnd = new Random();

    void isiBom() {
        int baris, kolom;
        for (int i = 0; i < jmlBom; i++) {
            do {
                baris = rnd.nextInt(peta.length);
                kolom = rnd.nextInt(peta.length);
            } while (peta[baris][kolom].nilai == -1);
            peta[baris][kolom].nilai = -1;
        }
    }

    void print() {
        for (int i = 0; i < peta.length; i++) {
            for (int j = 0; j < peta[i].length; j++) {
                System.out.println("[" + peta[i][j].nilai + "]");
            }
            System.out.println();
        }
    }

    void setAttrVal() {
        for (int i = 0; i < peta.length; i++) {
            for (int j = 0; j < peta[i].length; j++) {

                if (i == 0) {
                    peta[i][j].up = null;
                } else if (i == peta.length - 1) {
                    peta[i][j].down = null;
                } else {
                    peta[i][j].up = peta[i-1][j];
                    peta[i][j].down = peta[i+1][j];
                }
                
                if (j == 0) {
                    peta[i][j].left = null;
                } else if (j == peta.length - 1) {
                    peta[i][j].right = null;
                } else {
                    peta[i][j].left = peta[i][j-1];
                    peta[i][j].right = peta[i][j+1];
                }
                
                if (i == 0 && j == 0) {
                    peta[i][j].upleft = null;
                } else if (i == 0 && j == peta.length - 1) {
                    peta[i][j].upright = null;
                } else if (i == peta.length - 1 && j == 0) {
                    peta[i][j].downleft = null;
                } else if (i == peta.length - 1 && j == peta.length - 1) {
                    peta[i][j].downright = null;
                } else {
                    peta[i][j].upleft = peta[i-1][j-1];
                    peta[i][j].upright = peta[i-1][j+1];
                    peta[i][j].downleft = peta[i+1][j-1];
                    peta[i][j].downright = peta[i+1][j+1];

                }

            }
        }
    }

    void generateNumber() {
        for (int i = 0; i < peta.length; i++) {
            int count = 0;
            for (int j = 0; j < peta[i].length; j++) {
                if (peta[i][j].left.nilai == -1) {
                    count++;
                }
                if (peta[i][j].right.nilai == -1) {
                    count++;
                }
                if (peta[i][j].up.nilai == -1) {
                    count++;
                }
                if (peta[i][j].down.nilai == -1) {
                    count++;
                }
                if (peta[i][j].upleft.nilai == -1) {
                    count++;
                }
                if (peta[i][j].upright.nilai == -1) {
                    count++;
                }
                if (peta[i][j].downleft.nilai == -1) {
                    count++;
                }
                if (peta[i][j].downright.nilai == -1) {
                    count++;
                }
                peta[i][j].nilai = count;
            }
        }
    }

}
