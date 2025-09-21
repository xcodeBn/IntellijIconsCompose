package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StartmemoryprofileDark: ImageVector
    get() {
        if (_StartmemoryprofileDark != null) return _StartmemoryprofileDark!!

        _StartmemoryprofileDark = ImageVector.Builder(
            name = "StartmemoryprofileDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(8f, 4f)
                lineTo(15f, 8f)
                lineTo(8f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(9f, 3f)
                    lineTo(7f, 3f)
                    lineTo(7f, 9f)
                    lineTo(3f, 9f)
                    lineTo(3f, 0f)
                    lineTo(9f, 0f)
                    lineTo(9f, 3f)
                    close()
                }
            }
        }.build()

        return _StartmemoryprofileDark!!
    }

private var _StartmemoryprofileDark: ImageVector? = null

