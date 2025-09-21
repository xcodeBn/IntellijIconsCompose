package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunallDark: ImageVector
    get() {
        if (_RunallDark != null) return _RunallDark!!

        _RunallDark = ImageVector.Builder(
            name = "RunallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(7f, 12f)
                lineTo(12f, 8f)
                lineTo(7f, 4f)
                lineTo(7f, 2f)
                lineTo(15f, 8f)
                lineTo(7f, 14f)
                lineTo(7f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(2f, 2f)
                lineTo(10f, 8f)
                lineTo(2f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF499C54))
                ) {
                    moveTo(7f, 12f)
                    lineTo(12f, 8f)
                    lineTo(7f, 4f)
                    lineTo(7f, 2f)
                    lineTo(15f, 8f)
                    lineTo(7f, 14f)
                    lineTo(7f, 12f)
                    close()
                }
            }
        }.build()

        return _RunallDark!!
    }

private var _RunallDark: ImageVector? = null

