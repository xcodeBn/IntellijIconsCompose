package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Startmemoryprofile: ImageVector
    get() {
        if (_Startmemoryprofile != null) return _Startmemoryprofile!!

        _Startmemoryprofile = ImageVector.Builder(
            name = "Startmemoryprofile",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
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
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(8f, 4f)
                lineTo(15f, 8f)
                lineTo(8f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
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

        return _Startmemoryprofile!!
    }

private var _Startmemoryprofile: ImageVector? = null

