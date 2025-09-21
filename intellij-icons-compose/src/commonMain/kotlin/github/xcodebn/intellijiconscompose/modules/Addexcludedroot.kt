package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Addexcludedroot: ImageVector
    get() {
        if (_Addexcludedroot != null) return _Addexcludedroot!!

        _Addexcludedroot = ImageVector.Builder(
            name = "Addexcludedroot",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(9f, 11f)
                lineTo(16f, 11f)
                lineTo(16f, 16f)
                lineTo(9f, 16f)
                lineTo(9f, 11f)
                close()
                moveTo(9f, 10f)
                lineTo(12f, 10f)
                lineTo(13f, 11f)
                lineTo(9f, 11f)
                lineTo(9f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF26522))
                ) {
                    moveTo(9f, 11f)
                    lineTo(16f, 11f)
                    lineTo(16f, 16f)
                    lineTo(9f, 16f)
                    lineTo(9f, 11f)
                    close()
                    moveTo(9f, 10f)
                    lineTo(12f, 10f)
                    lineTo(13f, 11f)
                    lineTo(9f, 11f)
                    lineTo(9f, 10f)
                    close()
                }
            }
        }.build()

        return _Addexcludedroot!!
    }

private var _Addexcludedroot: ImageVector? = null

