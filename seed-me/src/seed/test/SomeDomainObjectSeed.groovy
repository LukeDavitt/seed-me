println "Seeding test someDomainObject"
seed  = {
    someDomainObject(meta:[key:'code'], code:'a', something:'5678', someEnum:'value1')
    someDomainObject(meta:[key:'code'], code:'b', something:'5679', someEnum:'value3')
}
