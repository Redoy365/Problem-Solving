n = int(input().strip())

x = 0
y = 0

while n>0:
    r = n%2
    if r == 1:
        x+=1
        if x > y:
            y = x
    else:
        x = 0
    n = n//2

print(y)