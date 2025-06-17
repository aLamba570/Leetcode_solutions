def stringJumper(str):
    for i in range(0, len(str)):  ## from 0 to length of str and skip 2
        if i%2 ==0:
            print(str[i], end="")