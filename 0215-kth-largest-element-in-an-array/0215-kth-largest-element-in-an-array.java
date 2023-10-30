class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> heap = new PriorityQueue();

        // for(int n: nums){
        //     heap.add(n);

        //     if(heap.size()>k){
        //         heap.poll();
        //     }
        // }
        // return heap.peek();

        Arrays.sort(nums);

        int kthLargest = nums[nums.length-k];

        return kthLargest;
    }
}

// Iterating through the Input Array:

// The code then iterates through the input array nums using a for-each loop. For each element n in the array, it performs the following actions:

// a. Adding Elements to the Heap:

// The element n is added to the heap using the add() method. This method inserts the element into the heap while maintaining the heap property, ensuring that the smallest element remains at the top.

// b. Maintaining Heap Size:

// If the size of the heap becomes greater than k, the poll() method is called. The poll() method removes and returns the smallest element from the heap. This ensures that the heap only holds the k largest elements encountered so far.

// Returning the kth Largest Element:

// After iterating through the entire input array, the peek() method is called on the heap. The peek() method returns the top element of the heap without removing it. Since the heap maintains the k largest elements, the top element represents the kth largest element in the original array.