package fonts;

import mapper.Mapper;

public class Font extends Mapper{

    @Override
    public String getString() {
        final String fileImport = "java : Java, c : C, cpp : C++, lex : C, js : JavaScript, jsm : JavaScript";
        return fileImport;
    }

    @Override
    public String[][] splitter(final String s) {

        final String temp[] = s.split(", ");
        final String str[][] = new String[temp.length][2];

        for (int i = 0; i < str.length; i++) {
            str[i] = temp[i].split(" : ");
            str[i][0] = "." + str[i][0];
        }

        return str;
    }
}