def MakeKey():
    f = open("alphabet.txt", 'r') #사용할 파일 읽기 모드로 열기
    makekey = open("key.txt", 'w') #키가 저장될 파일 쓰기 모드로 열기

    key_alphabet = { } #키값 저장 딕셔너리
    encryption_alphabets = { }
    global encryption_alphabet

    for alphabet in f.read(): #파일 내용
        if alphabet.isalpha(): #받은 값이 알파벳이라면 수행
            alphabet = alphabet.lower() #소문자로 만듬
            if alphabet in key_alphabet:
                key_alphabet[alphabet] += 1 #키에 대한 값 카운트 증가

            else :
                key_alphabet[alphabet]= 1 #최초 발견시 1로 지정
        else:
            continue

    key_alphabet = sorted(key_alphabet.items(), key = lambda x: x[1]) #키 정렬
    charnumber = 97

    for key, value in key_alphabet:
        makekey.write(f'{key}\n') #키 파일 작성
        encryption_alphabets[chr(charnumber)] = key #키와 대입되는 알파벳 딕셔너리 작성
        charnumber += 1

    encryption_alphabet = encryption_alphabets #대입 딕셔너리 전역변수 화

    f.close()
    makekey.close()

def Encryption():
    file = open("alphabet.txt", 'r') #사용할 파일 읽기 모드로 열기
    usekey = open("key.txt", 'r')
    encryption = open("encryptionfile.txt", 'w') #암호화 된 파일 저장될 파일 쓰기 모드로 열기

    for alphabet in file.read(): #원본 파일 읽기
        if alphabet.isalpha(): #원본 파일의 글자가 알파벳이면 암호화 아니면 출력
            alphabet = alphabet.lower()
            encryption.write(encryption_alphabet[alphabet])

        else:
            encryption.write(alphabet)

    file.close()
    usekey.close()
    encryption.close()

def Decryption():
    encryption = open("encryptionfile.txt", 'r') #암호화 된 파일 저장될 파일 쓰기 모드로 열기
    decryption = open("dncryptionfile.txt", 'w') #복호화 된 파일

    encryption_alphabet_swap = {value: key for key, value in encryption_alphabet.items()}

    for alphabet in encryption.read():
        if alphabet.isalpha(): #원본 파일의 글자가 알파벳이면 암호화 아니면 출력
            decryption.write(encryption_alphabet_swap[alphabet])

        else:
            decryption.write(alphabet)

MakeKey()
print("키 파일 생성 완료")

Encryption()
print("암호화 파일 생성 완료")

Decryption()
print("복호화 파일 생성 완료")
