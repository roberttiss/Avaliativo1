public class Triangulo {
        private int a;
        private int b;
        private int c;

        public Triangulo(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        //verifica se é triângulo 
        private boolean verifica(){
            return a + b > c && a + c > b && b + c > a;
        }
        //verifica se é triângulo e se é equilatero,caso for retorna true
        public boolean equilatero(){
            if(verifica()){
                return a == b && a == c;
            }

            return false;
        }
        //verifica se é triângulo e se é isosceles,caso for retorna true
        public boolean isosceles(){
            if(verifica()){
                return a == b || a == c || c == b;
            }

            return false;
        }
        //verifica se é triângulo e se é escaleno,caso for retorna true
        public boolean escaleno(){
            if(verifica()){
                return a != b && a == c && c != b;
            }

            return false;
        }
    }

