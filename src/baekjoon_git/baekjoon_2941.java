package baekjoon_git;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class baekjoon_2941 {


        public static void main(String[] args) throws IOException {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] save = bfr.readLine().split("");
            int show = save.length;
            for (int i = 0; i < save.length; i++) {
                if (i != save.length - 1) {
                    if (save[i].equals("c")) {
                        if (save[i + 1].equals("=") || save[i + 1].equals("-")) {
                            show -= 1;
                        }
                    }
                    if (save[i].equals("d")) {
                        if (save[i + 1].equals("-")) {
                            show -= 1;
                        }
                        if(i!=save.length-2) {
                            if (save[i + 1].equals("z") && save[i + 2].equals("=")) {
                                show -= 2;
                            }
                        }}
                    if (save[i].equals("l")) {
                        if (save[i + 1].equals("j")) {
                            show -= 1;
                        }
                    }
                    if (save[i].equals("n")) {
                        if (save[i + 1].equals("j")) {
                            show -= 1;
                        }
                    }
                    if (save[i].equals("s")) {
                        if (save[i + 1].equals("=")) {
                            show -= 1;
                        }
                    }
                    if (save[i].equals("z")) {
                        if (i == 0) {
                            if (save[i + 1].equals("=")) {
                                show -= 1;
                            }
                        } else {
                            if (save[i + 1].equals("=") && (!(save[i - 1].equals("d")))) {
                                show -= 1;
                            }
                        }
                    }

                }
            }
            bfw.write(show + "");
            bfw.flush();
            bfw.close();
        }

    }
