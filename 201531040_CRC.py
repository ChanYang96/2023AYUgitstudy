def makebinary(expression): #다항식을 2진수로 바꾼다

    tokens = expression.split('+') # 수식을 + 기호를 기준으로 나눈다.
    result = 0
    for token in tokens: #나눠진 수식을 다시 x 기준으로 나눈다
        if 'x' in token:
            var_value = int(token[1:])
            result += 2**var_value
        else:
            result += int(token)
    
    binary = ''
    while result > 0:
        binary = str(result % 2) + binary
        result //= 2
    return binary

def makechecksum(resultbinary, originaldata): #체크섬 데이터 만들기
    resultbinary = [int(bit) for bit in resultbinary]
    originaldata = [int(bit) for bit in originaldata] #데이터들을 정수로 만든다

    resultbinary_length = len(resultbinary)
    originaldata_length = len(originaldata) #데이터들의 길이를 알아낸다

    originaldata += [0] * (resultbinary_length - 1) #다항식의 차수만큼 원본 데이터를 늘린다.

    for i in range(originaldata_length):
        if originaldata[i] == 1: #xor 연산으로 계산한다
            for j in range(resultbinary_length):
                originaldata[i + j] ^= resultbinary[j]

    checksum = ''.join(map(str, originaldata[-(resultbinary_length - 1):])) #다항식 차수 만큼의 값 즉 최종 체크섬 값을 저장

    return checksum

def maketransmitdata(original_data):
    transmitdata = original_data + checksum
    return transmitdata

# 2진수인 다항식과 원본
expression = input("다항식 입력 : ")  # 다항식 2진수
resultbinary = makebinary(expression)

original_data = input("원본 데이타 값 입력 : ")      # 원본

checksum = makechecksum(resultbinary, original_data)
transmitdata = maketransmitdata(original_data)

print("체크섬 값 : ", checksum)
print("전송 데이타 값 : ", transmitdata)
