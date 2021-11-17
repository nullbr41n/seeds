# AWS STS ASSUME ROLE

* No Dependencies so typically should work with any linux system with aws cli installed
```
export $(printf "AWS_ACCESS_KEY_ID=%s AWS_SECRET_ACCESS_KEY=%s AWS_SESSION_TOKEN=%s" \
    $(aws sts assume-role \
    --role-arn <assume_role_arn> \
    --role-session-name <cur_session_name> \
    --query "Credentials.[AccessKeyId,SecretAccessKey,SessionToken]" \
    --output text))
```
