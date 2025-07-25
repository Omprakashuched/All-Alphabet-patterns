
import java.util.Scanner;

public class AlphaPatterns {

    // A Pattern (try n value for good look)
    public static void patternPractice19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    for (int k = 0; k < (n / 2); k++) {
                        System.out.print(" *");
                    }
                    break;
                }
                if (j == 0 || j == n || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /* B Pattern (For Odd n Values it works properly) if you want make for Even N values then
    just change i<=n, and in nested for loop for i values i==n, then you will get that */
    public static void patternPractice18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                if (i == 0 || i == n / 2 || i == n - 1) {
                    for (int k = 0; k <= (n / 2 - 1); k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //C Pattern
    public static void patternPractice20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n - 1) {
                    for (int k = 0; k < (n / 2 + 1); k++) {
                        System.out.print(" *");
                    }
                    break;
                }
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // D Pattern
    public static void patternPractice15(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                if (i == 0 || i == n) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // E Pattern (n vlaue properly work with Odd value if you want to make change you can).
    public static void patternPractice21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (i == 0 || i == n - 1 || i == n / 2) {
                    for (int k = 0; k < (n / 2); k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // F pattern
    public static void patternPractice14(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (i == 0 || i == n / 2) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //G Pattern(it works for all n natural numbers if you to see this more good then try n values more than 5)
    public static void patternPractice22(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n) {
                    for (int k = 0; k < (n / 2 + 1); k++) {
                        System.out.print(" *");
                    }
                    break;
                }
                if (j == 0) {
                    System.out.print("*");
                } else if (j == n) {
                    if (i > n / 2) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("*");
                        }
                    }
                    break;
                }
                if (i == n / 2 && j == n - 2) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // H Pattern
    public static void patternPractice23(int n) {

        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    if (i == n / 2 || j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {

                for (int j = 0; j < n; j++) {
                    if (i == n / 2 - 1 || j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    //I Pattern
    public static void patternPractice24(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 || i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // J pattern(try n values more than 5)
    public static void patternPractice25(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n) {
                    System.out.print("*");
                } else if (i == n - 1) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                }
                if (j == 0) {
                    if (i > n / 2) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("*");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // k pattern
    public static void patternPractice16(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    System.out.print("*");
                }
                if (i == n / 2) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else if (j == n) {
                    for (int k = 0; k < n / 4; k++) {
                        System.out.print("*");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // L pattern
    public static void patternPractice33(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    // M Pattern (Properly work for Odd size)
    public static void patternPractice11(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n || (i == j && j <= n / 2) || (j == n - i && j > n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // N Pattern
    public static void patternPractice12(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // O Pattern
    public static void patternPractice13(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n) {
                    System.out.print("*");
                } else if (i == 0 || i == n) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Q pattern(it works properly with odd Numbers)
    public static void patternPractice26(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 || j == 0) {
                    System.out.print("*");
                } else if (i == n - 1 || i == 0) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else if (i == j) {
                    for (int k = 0; k < 1; k++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // P pattern
    public static void patternPractice27(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (i == n / 2 || i == 0) {
                    for (int k = 0; k < n / 2; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else if (j == n) {
                    if (i < n / 2) {
                        for (int k = 0; k < 1; k++) {
                            System.out.print("*");
                        }
                    }
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // R Pattern
    public static void patternPractice17(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n) {
                    System.out.print("*");
                }
                if (i == 0 || i == n / 2) {
                    for (int k = 0; k <= (n / 2) - 1; k++) {
                        System.out.print(" *");
                    }
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //T pattern
    public static void patternPractice28(int n) {
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n / 2 || i == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (j == n / 2 || i == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }

    }

    //U pattern
    public static void patternPractice29(int n) {
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else if (i == n - 1) {
                        for (int k = 0; k < n / 2; k++) {
                            System.out.print(" *");
                        }
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (j == 0 || j == n) {
                        System.out.print("*");
                    } else if (i == n - 1) {
                        for (int k = 0; k < n / 2; k++) {
                            System.out.print(" *");
                        }
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }

    //V Pattern
    public static void patternPractice30(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= n; j++) {
                if (j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // X pattern
    public static void patternPractice10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Y pattern
    public static void patternPractice9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == j && j <= n / 2) || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // Z pattern
    public static void patternPractice31(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        patternPractice31(t);

    }
}
