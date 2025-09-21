package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TbhiddenDark: ImageVector
    get() {
        if (_TbhiddenDark != null) return _TbhiddenDark!!

        _TbhiddenDark = ImageVector.Builder(
            name = "TbhiddenDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 2f)
                close()
                moveTo(5f, 3f)
                lineTo(5f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 3f)
                lineTo(5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 4f)
                lineTo(3f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 4f)
                lineTo(3f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(4f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 12f)
                    lineTo(4f, 12f)
                    lineTo(4f, 2f)
                    close()
                    moveTo(5f, 3f)
                    lineTo(5f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 3f)
                    lineTo(5f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 4f)
                    lineTo(3f, 13f)
                    lineTo(12f, 13f)
                    lineTo(12f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 4f)
                    lineTo(3f, 4f)
                    close()
                }
            }
        }.build()

        return _TbhiddenDark!!
    }

private var _TbhiddenDark: ImageVector? = null

