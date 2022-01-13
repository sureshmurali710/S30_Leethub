class Solution 
{
    public int findMin(int[] A) 
    {
        int low = 0;
		int high = A.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(A[mid] > A[high])					// Minimum must be in A[mid + 1, high]
                low = mid + 1;				
            else if(A[mid] < A[high])			// Minimum must be in A[low, mid]
                high = mid;
			else // if(A[mid] == A[end])		// Skip duplicates
				high--;
        }
        return A[low];						// Loop ends when start == end
    }
}