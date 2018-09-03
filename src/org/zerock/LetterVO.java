package org.zerock;

public class LetterVO {

    //두개의 데이타 묶어서 하나로 표현
    Character value;
    int count;

    //생성자 alt + insert
    public LetterVO(Character value) {
        this.value = value;
        this.count = 0;
    }


    @Override
    public String toString() {
        return "LetterVO{" +
                "value=" + value +
                ", count=" + count +
                '}';
    }
}
