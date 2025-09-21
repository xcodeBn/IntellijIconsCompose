package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TbshownDark: ImageVector
    get() {
        if (_TbshownDark != null) return _TbshownDark!!

        _TbshownDark = ImageVector.Builder(
            name = "TbshownDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 3f)
                lineTo(13f, 3f)
                lineTo(13f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 3f)
                close()
                moveTo(4f, 4f)
                lineTo(4f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 3f)
                    lineTo(13f, 3f)
                    lineTo(13f, 13f)
                    lineTo(3f, 13f)
                    lineTo(3f, 3f)
                    close()
                    moveTo(4f, 4f)
                    lineTo(4f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 4f)
                    lineTo(4f, 4f)
                    close()
                }
            }
        }.build()

        return _TbshownDark!!
    }

private var _TbshownDark: ImageVector? = null

