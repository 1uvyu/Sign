//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        String str;
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines();
        str = sign1.getLines();
//        str = sign1.getLines();
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines();
//        str = sign2.getLines();
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines();
//        str = sign3.getLines();
        Sign sign4 = new Sign("", 4);
        x = sign4.numberOfLines();
//        str = sign4.getLines();
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numberOfLines();
//        str = sign5.getLines();

//        Sign a = new Sign("Everything on sale, please come in", 15);
//        Sign b = new Sign("Everything on sale, please come in", 17);
//        Sign c = new Sign("Everything on sale, please come in", 40);
    }
}