NameList = ["Anni","Charles", "Hannah", "Nick", "Bongi", "Boson", "Sophie", "Ivy","Martin","Harley","Gordon", "Austin"]
ans = 0
cnt = 0

for name in NameList:
    print(name)
    for letter in name:
        if (letter == 'i'):
            ans=ans+1
            

print("\n" + NameList[8]+ "\n"+ "number of 'i's in the name list: " + str(ans))


