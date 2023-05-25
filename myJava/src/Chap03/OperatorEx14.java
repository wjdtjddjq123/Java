package Chap03;
class OperatorEx14 { 
      public static void main(String[] args) { 
            char c = 'a'; 
            for(int i=0; i<26; i++) {          // 0~25까지 반복 
                        System.out.print(c++); // a~z 
            } 
            
            System.out.println(); // 줄바꿈

            c = 'A'; 
            for(int i=0; i<26; i++) {          // 0~25까지 반복 
                        System.out.print(c++); // A~Z 
            } 

            System.out.println(); // 줄바꿈

            c='0'; 
            for(int i=0; i<10; i++) {          // 0~9 반복 
                        System.out.print(c++); // 0~9 출력 
            } 
            System.out.println(); 
      } 
} 
