package th.Mukya;
/**
 ** @author Mukya_Wongdaraphanich 5907101012
 **
 */
import java.util.*;
public class test {
	public test(){
		
	}
	public static void main(String[]args){
	
		words w1 = new words("ant","N","��");
		words w2 = new words("anti","N","������͵�ҹ");
		words w3 = new words("apple","N","�ͻ����");
		words w4 = new words("bat","N","��ҧ���");
		words w5 = new words("bath","V","�Һ���");
		words w6 = new words("battery","N","ẵ�������");
		words w7 = new words("cat","N","���");
		words w8 = new words("catfish","N","��Ҵء");
		words w9 = new words("car","N","ö");
		words w10 = new words("dog","N","���");
		words w11 = new words("dogma","N","��ѡ��ʹ�");
		words w12 = new words("dagger","N","��ԫ,�մ");
		words w13 = new words("eagle", "N" ,"���Թ���");
		words w14 = new words("edgy","N","����Ѻ������� , �繡ѧ�� , ˧ش˧Դ");
		words w15 = new words("egg","N","��");
		words w16 = new words("frog","N","��");
		words w17 = new words("fox" ,"N","��Ҩ�駨͡");
		words w18 = new words("fog","N","��͡");
		words w19 = new words("garbage","N","��ɢ��,�����Ž��");
		words w20 = new words("genius","N","�Ѩ�����Ҿ");
		words w21 = new words("give","V","���");
		words w22 = new words("hate","V","���´");
		words w23 = new words("hat","N","��ǡ");
		words w24 = new words("huge","ADJ","�˭��");
		words w25 = new words("ice","N","�����");
		words w26 = new words("independence","N","�������");
		words w27 = new words("india","N","������Թ���");
		words w28 = new words("jar","N","���,��");
		words w29 = new words("jakarta","N","��ا�ҡ����");
		words w30 = new words("jaguar","N","���ͨҡ����");
		words w31 = new words("kenya","N","�����ह���");
		words w32 = new words("kangaroo","N","�ԧ��");
		words w33 = new words("kansus","N","�Ѱ᤹���");
		words w34 = new words("lion","N","�ԧ�");
		words w35 = new words("lonely","ADJ","����������,���Ǵ��");
		words w36 = new words("love","N","�����ѡ");
		words w37 = new words("monkey","N","�ԧ");
		words w38 = new words("money","N","�Թ");
		words w39 = new words("many","ADJ","�ҡ���");
		words w40 = new words("noun","N","���,�ӹ��");
		words w41 = new words("normal","N","���л���");
		words w42 = new words("nokia","N","���Ѿ����Ͷ��������˹��ᶺ���û");
		words w43 = new words("october","N","��͹���Ҥ�");
		words w44 = new words("octopus","N","�����֡�ѡ��");
		words w45 = new words("ocarina","N","����ͧ�������Ҫ�Դ˹��");
		words w46 = new words("pink","N","�ժ���");
		words w47 = new words("pizza","N","�ԫ���");
		words w48 = new words("perfect","ADJ","�١��ͧ,�������,����Ǫҭ");
		words w49 = new words("quiz","N","����ͺ");
		words w50 = new words("quiet","ADJ","��º");
		words w51 = new words("quite","ADV","������,��͹��ҧ��");
		words w52 = new words("rocket","N","��Ǵ");
		words w53 = new words("rock","N","�Թ");
		words w54 = new words("ragnarok","N","��÷�ʧ�������駹֧�ͧ෾㹹���¹ͫ");
		words w55 = new words("snake","N","��");
		words w56 = new words("snack","N","�������ҧ");
		words w57 = new words("snail","N","��·ҡ");
		words w58 = new words("table","N","���");
		words w59 = new words("tablet","N","���ŵ");
		words w60 = new words("tale","N","����ͧ����");
		words w61 = new words("umbrella","N","���");
		words w62 = new words("university","N","����Է�����");
		words w63 = new words("unite","V","������,���������ѹ");
		words w64 = new words("venom","N","��ɨҡ��ö١�ѵ�����,�Ѵ");
		words w65 = new words("vellum","N","˹ѧ��");
		words w66 = new words("volume","N","�дѺ�����ѧ�ͧ���§,����ҳ");
		words w67 = new words("wolf","N","��һ��");
		words w68 = new words("wolverine","N","�ѵ��Թ���͵�С� weasel");
		words w69 = new words("world","N","�š");
		words w70 = new words("x-ray","N","�ѧ����硫�");
		words w71 = new words("xenon","N","�ҵػ�������ҫ��Դ˹�觵����� Xe");
		words w72 = new words("xmas","N","���ʵ����");
		words w73 = new words("yakitori","N","����ҧ��ѡ��ʢͧ�����");
		words w74 = new words("yam","N","�ѹ��");
		words w75 = new words("yard","N","ʹ��");
		words w76 = new words("zero","N","�Ţ�ٹ��");
		words w77 = new words("zeus","N","෾��ҫ��");
		words w78 = new words("zion","N","������");
		
		
		hashfunction test = new hashfunction(200);
		
		test.insert(w1);
		test.insert(w2);
		test.insert(w3);
		test.insert(w4);
		test.insert(w5);
		test.insert(w6);
		test.insert(w7);
		test.insert(w8);
		test.insert(w9);
		test.insert(w10);
		test.insert(w11);
		test.insert(w12);
		test.insert(w13);
		test.insert(w14);
		test.insert(w15);
		test.insert(w16);
		test.insert(w17);
		test.insert(w18);
		test.insert(w19);
		test.insert(w20);
		test.insert(w21);
		test.insert(w22);
		test.insert(w23);
		test.insert(w24);
		test.insert(w25);
		test.insert(w26);
		test.insert(w27);
		test.insert(w28);
		test.insert(w29);
		test.insert(w30);
		test.insert(w31);
		test.insert(w32);
		test.insert(w33);
		test.insert(w34);
		test.insert(w35);
		test.insert(w36);
		test.insert(w37);
		test.insert(w38);
		test.insert(w39);
		test.insert(w40);
		test.insert(w41);
		test.insert(w42);
		test.insert(w43);
		test.insert(w44);
		test.insert(w45);
		test.insert(w46);
		test.insert(w47);
		test.insert(w48);
		test.insert(w49);
		test.insert(w50);
		test.insert(w51);
		test.insert(w52);
		test.insert(w52);
		test.insert(w53);
		test.insert(w54);
		test.insert(w55);
		test.insert(w56);
		test.insert(w57);
		test.insert(w58);
		test.insert(w59);
		test.insert(w60);
		test.insert(w61);
		test.insert(w62);
		test.insert(w63);
		test.insert(w64);
		test.insert(w65);
		test.insert(w66);
		test.insert(w67);
		test.insert(w68);
		test.insert(w69);
		test.insert(w70);
		test.insert(w71);
		test.insert(w72);
		test.insert(w73);
		test.insert(w74);
		test.insert(w75);
		test.insert(w76);
		test.insert(w77);
		test.insert(w78);

		Scanner input = new Scanner(System.in);
		System.out.println("Dictionary test by Mukya 5907101012");
		char ch= ' ';
		
		//Dictionary operations
		
			do{
			System.out.println("\nDictionary Operation");
			System.out.println("1 : Search words and show meaning");
			System.out.println("2 : Add new words");
			System.out.println("3 : Delete existing word");
						
			int choice = input.nextInt();
			
			if(choice==1){
				System.out.println("Enter the key word");
				words test1 = new words(input.next(),null,null);
				System.out.println(test.find(test1.getWord()));
				System.out.println("if you want to see next or previous word please type (next / previous / no)");
				words check = new words(input.next(),null,null);
				
				if(check.getWord().equals("next")){
					System.out.println("the next word of : "+test1.getWord()+" is "+test.find(test1.getWord(),check));
				}
				else if(check.getWord().equals("previous")){
					System.out.println("the next word of : "+test1.getWord()+" is "+test.find(test1.getWord(),check));
				}
				else{
					System.out.println("Return to the menu");;
				}	}
			else if(choice==2){
				System.out.println("Enter the word you want to add");
				String word = input.next();
				System.out.println("Enter the type of your word (noun,adjective)");
				String type = input.next();
				System.out.println("Enter the meaning of your word");
				String meaning = input.next();
				
				words w79 = new words(word,type,meaning);
				test.insert(w79);
				
				}
			else if (choice==3){
				
				System.out.println("Enter the word you want to delete");
				words test2 = new words(input.next(),null,null);
				test.delete(test2.getWord());
				System.out.println("");
			}
			else{
				System.out.println("Wrong entry \n");
			
			}
			
			System.out.println("\nDo you want to continue ? (y or n)");
			ch= input.next().charAt(0);
			
			  } while (ch == 'Y'|| ch == 'y');   
	}
}