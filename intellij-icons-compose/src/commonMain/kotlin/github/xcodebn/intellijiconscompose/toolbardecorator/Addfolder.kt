package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Addfolder: ImageVector
    get() {
        if (_Addfolder != null) return _Addfolder!!

        _Addfolder = ImageVector.Builder(
            name = "Addfolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
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
                    fill = SolidColor(Color(0xFF6E6E6E))
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

        return _Addfolder!!
    }

private var _Addfolder: ImageVector? = null

