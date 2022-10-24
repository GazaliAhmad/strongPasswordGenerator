import secrets


def generatePassword():
    password = ""
    while len(password) < 16:
        password += chr(secrets.randbelow(94) + 33)
    return password


print(f"\nAuto generated password: {generatePassword()}\n")


"""_Using random module_
import random

def generatePassword():
  password = ""
  while len(password) < 16:
    password += chr(random.randint(33, 126))
  return password
"""
