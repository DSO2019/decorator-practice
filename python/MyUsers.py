from approve import Approve
from delete import Delete
from comment import Comment
from publish import Publish
from EndUser import EndUser

def __init__(self):
    pass

def main():
    admin = EndUser("Admin")
    publisher = EndUser("Publisher")
    editor = EndUser("Editor")

    adminComment = Comment(admin)
    adminApprove = Approve(admin)
    adminPublish = Publish(admin)
    adminDelete = Delete(admin)

    admin.setPublish(adminPublish.publish())
    admin.setComment(adminComment.comment())
    admin.setDelete(adminDelete.delete())
    admin.setApprove(adminApprove.approve())

    print(admin.getName() + ' ' + admin.getDelete())
    print(admin.getName() + ' ' + admin.getApprove())
    print(admin.getName() + ' ' + admin.getPublish())
    print(admin.getName() + ' ' + admin.getComment())

    publisherApprove = Approve(publisher)
    publisherPublish = Publish(publisher)

    publisher.setPublish(publisherPublish.publish())
    publisher.setApprove(publisherApprove.approve())

    print(publisher.getName() + ' ' + publisher.getDelete())
    print(publisher.getName() + ' ' + publisher.getApprove())
    print(publisher.getName() + ' ' + publisher.getPublish())
    print(publisher.getName() + ' ' + publisher.getComment())

    editorComment = Comment(editor)
    editorPublish = Publish(editor)

    editor.setPublish(editorPublish.publish())
    editor.setComment(editorComment.comment())

    print(editor.getName() + ' ' + editor.getDelete())
    print(editor.getName() + ' ' + editor.getApprove())
    print(editor.getName() + ' ' + editor.getPublish())
    print(editor.getName() + ' ' + editor.getComment())

if __name__ == '__main__':
    main()
