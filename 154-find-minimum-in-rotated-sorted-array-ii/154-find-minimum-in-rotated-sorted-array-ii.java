class Solution 
{
    public int findMin(int[] A) 
    {
        int start = 0;
		int end = A.length - 1;
        
        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(A[mid] > A[end])					// Minimum must be in A[mid + 1, end]
                start = mid + 1;				
            else if(A[mid] < A[end])			// Minimum must be in A[start, mid]
                end = mid;
			else // if(A[mid] == A[end])		// Skip duplicates
				end--;
        }
        return A[start];						// Loop ends when start == end
    }
}