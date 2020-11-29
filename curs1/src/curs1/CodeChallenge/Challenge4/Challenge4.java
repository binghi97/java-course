package curs1.CodeChallenge.Challenge4;

import java.util.Scanner;

public class Challenge4 {

  static int[] deleteAtIndex(int[] arr, int b) {
    int[] c = new int[arr.length - 1];
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (flag == false) {
        if (i != b) {
          c[i] = arr[i];
        } else {
          flag = true;
        }
      } else {
        c[i - 1] = arr[i];
      }
    }
    return c;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    int[] arr = new int[number];
    for (int i = 0; i < number; i++) {
      arr[i] = input.nextInt();
    }

    int contor = 0;
    boolean perechi = false;

    while (arr.length > 2) {
      for (int j = 1; j < arr.length; j++) {
        if (perechi == true){
          break;
        }
        for (int k = 1; k < arr.length; k++){
          if (k==j){
            continue;
          }else{
            int sum = arr[0] + arr[j] + arr[k];
            if (sum == 0) {
              arr = deleteAtIndex(arr, 0);
              arr = deleteAtIndex(arr, j - 1);
              arr = deleteAtIndex(arr, k - 2);
              contor++;
              perechi = true;
              break;
            }
          }
        }
      }

      if (perechi == false) {
        arr = deleteAtIndex(arr, 0);
      } else {
        perechi = false;
      }
    }
    System.out.println(contor);
  }
}
