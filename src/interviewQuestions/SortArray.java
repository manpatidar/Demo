package interviewQuestions;

public class SortArray {
	public void sort(int[] a, int low, int high) {
		int l, h, temp;

		l = low;
		h = high;
		int p = (low + high) / 2;
		while (l <= h) {
			while (a[p] > a[l]) {
				l++;
			}
			while (a[p] < a[h]) {
				h--;
			}
			if (l <= h) {
				temp = a[l];
				a[l++] = a[h];
				a[h--] = temp;
			}
		}
		if(low<h)
		sort(a, low, h - 1);
		if(high>l)
		sort(a, l + 1, high);

		
	}

	public static void main(String[] args) {

		SortArray sa = new SortArray();
		int[] b = { 11, 21, 35, 64, 25, 76, 17, 98, 59, 10 };
		int l = 0, h;
		h = 10;
		sa.sort(b, l, h);
		for (int i = 0; i < 10; i++)
			System.out.println(b[i]);
	}

}
