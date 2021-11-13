# Example of raising exception in python/boto3.
# e.g ClientError
#     Error code: TooManyRequestsException

# Handy when you want to raise exception to test something like 
# Retry mechanism such as https://pypi.org/project/backoff/
raise ClientError({"Error": {"Code": "TooManyRequestsException",
                             "Message": "TooManyRequestsException"}},
                  'invoke')
