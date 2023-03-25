package cn.cshao.user.cmpt.security.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author cshao
 * @desc
 * @company
 * @create 2023-02-20 1:14 下午
 */
@Slf4j
public class WebServiceHeaderIntercepter extends AbstractPhaseInterceptor<Message> {
    private String qname;
    private String username ;
    private String password ;

    public WebServiceHeaderIntercepter(){
        super(Phase.POST_PROTOCOL);

    }

    public WebServiceHeaderIntercepter(String username, String password) {
        super(Phase.POST_PROTOCOL);
        this.username =username;
        this.password =password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        Map<String, List> headers = (Map<String, List>)message.get(Message.PROTOCOL_HEADERS);
        try{
            headers.put("username", Collections.singletonList(username));
            headers.put("password", Collections.singletonList(password));
        }catch (Exception e){
            throw new Fault(e);
        }
    }
}
