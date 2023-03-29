package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Anime {
	String name;
	String director;
	String genre;
	double rating;
	
	public Anime(String name, String director, String genre,double rating) {
		this.name = name;
		this.director = director;
		this.genre = genre;
		this.rating = rating;
		}
		
	void print() {
		System.out.printf("%20s %20s %20s %20f \n", name, director, genre, rating);
	}
	
	void printToFile(PrintStream stream) {
		stream.printf("%20s %20s %20s %20f \n", name, director, genre, rating);
		}
	
	public static void main(String[] args) {
		Anime animes[] = new Anime[12];
		
		animes[0] = new Anime("Клинок, рассекающий демонов", "Харуо Сотодзаки", "Сёнэн", 8.2);
		animes[1] = new Anime("Ходячий замок", "Хаяо Миядзаки", "Приключения", 8.3);
		animes[2] = new Anime("Реинкарнация безработного", "Манабу Окамото", "Этти", 8.2);
		animes[3] = new Anime("Обещанный Неверленд", "Мамору Канбэ", "Сёнэн", 7.9);
		animes[4] = new Anime("Нет игры – нет жизни", "Ацуко Исидзука", "Этти", 7.8);
		animes[5] = new Anime("Цитрус", "Такэо Такахаси", "Сёдзё-ай", 6.3);
		animes[6] = new Anime("Клуб Яричин", "Аи Ёсимура", "Яой", 6.7);
		animes[7] = new Anime("Наруто", "Хаято Датэ", "Сёнэн", 7.6);
		animes[8] = new Anime("Стальной алхимик", "Сэйдзи Мидзусима", "Сёнэн", 8.2);
		animes[9] = new Anime("Король-шаман", "Сэйдзи Мидзусима", "Сёнэн", 7.7);
		animes[10] = new Anime("Доктор Стоун", "Осаму Набэсима", "Сёнэн", 8.2);
		animes[11] = new Anime("Тетрадь смерти", "Тэцуро Араки", "Сёнэн", 8.6);
		
		System.out.printf("%20s %20s %20s %20s \n", "Аниме","Режиссер","Жанр", "Рейтинг");
		for (Anime anime : animes) anime.print();
		
		//Сортировка
		for (int i = 0; i < animes.length; i++) {
			int j_max = i;
			for (int j = i + 1; j < animes.length; j++) {
				if (animes[j_max].rating < animes[j].rating) {
					j_max = j;
				}
			}
			Anime temp = animes[i];
			animes[i] = animes[j_max];
			animes[j_max] = temp;
		}
		
		System.out.printf("После сортировки по рейтингу\n");
		for (Anime anime : animes) anime.print();
		
		try {
			PrintStream out = new PrintStream(new File("C:/Users/alena/Desktop/lab1/1.txt"));
			for (Anime anime : animes) {
				anime.printToFile(out);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
