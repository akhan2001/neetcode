class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums_set = set()
        for n in nums:
            if n in nums_set:
                return n
            nums_set.add(n)
        return 0
