import secrets


def generatePassword(length):
    password = ""
    while len(password) < length:
        password += chr(secrets.randbelow(94) + 33)
    return password


length = 16
print(f"\nAuto generated password: {generatePassword(length)}\n")


"""
# if pwdlen is not integer, repeat the input
pwdlen = int(input("Enter the length of the password: "))

if not isinstance(pwdlen, int):
    while not isinstance(pwdlen, int):
        pwdlen = int(input("Enter the length of the password: "))
else:  # if pwdlen is integer, generate the password
    print(generatePassword(pwdlen))
"""

"""_Using random module_
import random

def generatePassword():
  password = ""
  while len(password) < 16:
    password += chr(random.randint(33, 126))
  return password
"""
