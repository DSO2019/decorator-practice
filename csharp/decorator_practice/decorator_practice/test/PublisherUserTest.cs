using System;
using System.Collections.Generic;
using System.Text;
using decorator_practice.main.decorator;
using decorator_practice.main.users;
using Moq;
using NUnit.Framework;

namespace decorator_practice.test
{
    [TestFixture]
    class PublisherUserTest
    {
        public Mock<User> user;
        public PublisherUser pu;

        [SetUp]
        public void SetUp()
        {
            pu = new PublisherUser();
            user = new Mock<User>(pu);
        }

        [TestCase]
        public void NameTest()
        {
            Assert.AreEqual("Publisher", user.Object.getName());
        }
    }
}