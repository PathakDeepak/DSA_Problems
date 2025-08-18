package search_algo.binarySearch;

/**
 * You are given an array ‘pages’ of integer numbers. In this array, the ‘pages[i]’ represents the number of pages in the ‘i-th’ book. There are ‘m’ number of students, and the task is to allocate all the books to the students.
 *</p>
 * Allocate books in a way such that:
 *</p>
 * Each student gets at least one book.
 * Each book should be allocated to a student.
 * Book allocation should be in a contiguous manner.
 *</p>
 * You have to allocate the books to ‘m’ students such that the maximum number of pages assigned to a student is minimum.
 */
public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] books = {10, 20, 30, 40};
        int students = 2;
        int len = books.length;
        int res = findMinPages(books, len, students);
        System.out.println(res);
    }

    private static int findMinPages(int[] books, int len, int students) {
        //base case if students is less than no. of books we cannot allocate at least one book criteria
        if (students > len) return -1;

        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < len; i++) {
            start = Math.max(start, books[i]);
            end += books[i];
        }

        int res = -1;
        while (start <=end) {
            int mid = start + (end-start)/2;
            if (isAllocationPossible(books, mid, students)){
                res = mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return res;

    }

    private static boolean isAllocationPossible(int[] books, int mid, int students) {
        int pages = 0;
        int currentStudent = 1;
        for (int i = 0; i < books.length; i++) {
            pages += books[i];
            if (pages > mid){
                currentStudent += 1;
                pages = books[i];
            }
            if (currentStudent > students) return false;
        }
        return true;
    }
}
