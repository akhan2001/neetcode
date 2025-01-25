class Solution(object):
    def sortArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        def mergeSort(nums, left, right):
            if left >= right:
                return
            mid = (left + right) // 2
            mergeSort(nums, left, mid)
            mergeSort(nums, mid, right)
            merge(nums, left, mid, right)
        
        def merge(nums, left, mid, right):
            temp = []
            i, j = left, mid + 1
            while i <= mid and j <= right:
                if nums[i] < nums[j]:
                    temp.append(nums[i])
                    i += 1
                else:
                    temp.append(nums[j])
                    j += 1
            while i <= mid:
                temp.append(nums[i])
                i += 1
            while j <= right:
                temp.append(nums[j])
                j += 1
            nums[left:right+1] = temp

        mergeSort(nums, 0, len(nums) - 1)
        return nums