class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # while "()" in s or "[]" in s or "{}" in s:
        #     s = s.replace("()", "")
        #     s = s.replace("[]", "")
        #     s = s.replace("{}", "")
        # return s == ""

        # stack approach
        stack = []
        for char in s:
            if char in ["(", "[", "{"]:

                stack.append(char)
            elif char in [")", "]", "}"]:
                if not stack:
                    return False
                top = stack.pop()
                if char == ")" and top != "(":
                    return False
                if char == "]" and top != "[":
                    return False
                if char == "}" and top != "{":
                    return False
        return not stack
