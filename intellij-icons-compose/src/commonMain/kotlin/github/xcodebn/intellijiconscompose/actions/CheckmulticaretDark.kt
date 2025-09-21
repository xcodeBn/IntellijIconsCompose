package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmulticaretDark: ImageVector
    get() {
        if (_CheckmulticaretDark != null) return _CheckmulticaretDark!!

        _CheckmulticaretDark = ImageVector.Builder(
            name = "CheckmulticaretDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(7f, 2f)
                lineTo(6f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 8f)
                lineTo(8f, 7f)
                lineTo(8f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 2f)
                lineTo(7f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 2f)
                lineTo(10f, 3f)
                lineTo(4f, 8f)
                lineTo(2f, 6f)
                lineTo(3f, 5f)
                lineTo(4f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(7f, 2f)
                    lineTo(6f, 3f)
                    lineTo(1f, 3f)
                    lineTo(1f, 9f)
                    lineTo(7f, 9f)
                    lineTo(7f, 8f)
                    lineTo(8f, 7f)
                    lineTo(8f, 10f)
                    lineTo(0f, 10f)
                    lineTo(0f, 2f)
                    lineTo(7f, 2f)
                    close()
                }
            }
        }.build()

        return _CheckmulticaretDark!!
    }

private var _CheckmulticaretDark: ImageVector? = null

