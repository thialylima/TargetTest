public class SequenciasLogicas {
    public static void main(String[] args) {
        System.out.println("Próximo número da sequência a: " + proximoA());
        System.out.println("Próximo número da sequência b: " + proximoB());
        System.out.println("Próximo número da sequência c: " + proximoC());
        System.out.println("Próximo número da sequência d: " + proximoD());
        System.out.println("Próximo número da sequência e: " + proximoE());
        System.out.println("Próximo número da sequência f: " + proximoF());
    }

    // a) 1, 3, 5, 7, ___
    public static int proximoA() {
        int[] sequenciaA = { 1, 3, 5, 7 };
        return sequenciaA[sequenciaA.length - 1] + 2; // Soma 2 ao último número
    }

    // b) 2, 4, 8, 16, 32, 64, ____
    public static int proximoB() {
        int[] sequenciaB = { 2, 4, 8, 16, 32, 64 };
        return sequenciaB[sequenciaB.length - 1] * 2; // multiplica o último número por 2
    }

    // c) 0, 1, 4, 9, 16, 25, 36, ____
    public static int proximoC() {
        int[] sequenciaC = { 0, 1, 4, 9, 16, 25, 36 };
        int n = sequenciaC.length;
        return n * n; // diferença entre os números: 3, 5, 7, 9, 11, (+2) ... então --> 36+13=49
    }

    // d) 4, 16, 36, 64, ____
    public static int proximoD() {
        int[] sequenciaD = { 4, 16, 36, 64 };
        int n = sequenciaD.length + 1;
        return n * n * 4; // diferença entre números: 12, 20, 28 (de 8 em 8, então 28+8=36 --> 64+36= 100)
    }

    // e) 1, 1, 2, 3, 5, 8, ____
    public static int proximoE() {
        int[] sequenciaE = { 1, 1, 2, 3, 5, 8 };
        return sequenciaE[sequenciaE.length - 1] + sequenciaE[sequenciaE.length - 2]; // soma os dois últimos números
    }

    // f) 2, 10, 12, 16, 17, 18, 19, ____
    public static int proximoF() {
        int[] sequenciaF = { 2, 10, 12, 16, 17, 18, 19 };
        return sequenciaF[sequenciaF.length - 1] + 1; // soma 1 ao último número
    }
}