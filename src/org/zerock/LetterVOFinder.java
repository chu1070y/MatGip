package org.zerock;

public class LetterVOFinder {

    LetterVO[] vos;

    //생성자
    public LetterVOFinder() {
        //this: 이 인스턴스 안에 있는
        this.vos = new LetterVO[26];
        for(int i=0; i<26; i++){

            char ch = (char)(i+65);
            this.vos[i] = new LetterVO(ch);
        }//for
    }

    //글자 주면 찾기
    public LetterVO findByChar(char ch){

        LetterVO result = null;

        //A면 0번째
        int value = (int)ch;

        result = this.vos[value -65];

        return result;
    }

//    //디버깅용
//    public static void main(String[] args) {
//        LetterVOFinder finder = new LetterVOFinder();
//        LetterVO vo = finder.findByChar('A');
//        System.out.println(vo);
//    }



}
