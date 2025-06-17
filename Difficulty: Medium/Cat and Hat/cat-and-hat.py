def cat_hat(str):
  ##your code here##
  ##You need to write complete code this time 
  a = 'cat'
  b = 'hat'
  
  ca = 0
  cb = 0
  
  for i in range(0, len(str)):
      if str[i:i+3] == a:
          ca+=1
      elif str[i:i+3] == b:
          cb+=1
    
  if ca == cb:
      return True
  return False
    