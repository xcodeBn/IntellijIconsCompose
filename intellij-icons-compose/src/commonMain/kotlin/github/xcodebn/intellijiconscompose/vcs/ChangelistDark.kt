package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChangelistDark: ImageVector
    get() {
        if (_ChangelistDark != null) return _ChangelistDark!!

        _ChangelistDark = ImageVector.Builder(
            name = "ChangelistDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
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
                    moveTo(2f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
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

        return _ChangelistDark!!
    }

private var _ChangelistDark: ImageVector? = null

