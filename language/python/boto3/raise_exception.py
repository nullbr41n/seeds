# Example of raising exception in python/boto3.
# e.g ClientError
#     Error code: TooManyRequestsException

# Handy when you want to raise exception to test something like 
# Retry mechanism such as https://pypi.org/project/backoff/
@backoff.on_exception(backoff.expo, ClientError, max_time=3)
def func():
  try:
  #........
  #........
  #........
  #........  
    raise ClientError({"Error": {"Code": "TooManyRequestsException",
                                 "Message": "TooManyRequestsException"}},
                      'invoke')
    except ClientError as error:
        if error.response['Error']['Code'] == 'TooManyRequestsException':
            raise error
        if error.response['Error']['Code'] == 'ResourceNotReadyException':
            raise error
