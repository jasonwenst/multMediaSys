#####################################################################
# 本文件包括对子目录和当前目录有多个目标的编译
# 说明：
#     1.若需要编译多个子目录，设置 SUBDIRS 变量为子目录的名称
#     2.若需要编译当前目录下的多个目标，设置 SUBMAKES 变量为 Makefile 的文件名
#####################################################################


# 需要编译的子目录【可选】

SUBDIRS= pwrapper common nr pcc udp_server msg_dispatch  ca srm nrm

# 当前路径下需要编译的多个目标【可选】
#SUBMAKES = ../../util/aierr/ailog_svc/Makefile.frm 

#####################################################################

# 编译规则【不能修改】
include $(OB_REL)/etc/NGMastermake

# update error config
upef:
	find ./ -name '*error_config.xml' | xargs touch
