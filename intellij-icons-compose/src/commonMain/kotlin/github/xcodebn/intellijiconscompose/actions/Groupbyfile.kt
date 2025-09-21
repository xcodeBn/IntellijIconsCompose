package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Groupbyfile: ImageVector
    get() {
        if (_Groupbyfile != null) return _Groupbyfile!!

        _Groupbyfile = ImageVector.Builder(
            name = "Groupbyfile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 3f)
                lineTo(11f, 3f)
                lineTo(11f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 7f)
                close()
                moveTo(7f, 3f)
                lineTo(7f, 6f)
                lineTo(4f, 6f)
                lineTo(7f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(4f, 7f)
                    lineTo(8f, 7f)
                    lineTo(8f, 3f)
                    lineTo(11f, 3f)
                    lineTo(11f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 7f)
                    close()
                    moveTo(7f, 3f)
                    lineTo(7f, 6f)
                    lineTo(4f, 6f)
                    lineTo(7f, 3f)
                    close()
                }
            }
        }.build()

        return _Groupbyfile!!
    }

private var _Groupbyfile: ImageVector? = null

