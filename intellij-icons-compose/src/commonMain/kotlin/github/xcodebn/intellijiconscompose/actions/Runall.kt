package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Runall: ImageVector
    get() {
        if (_Runall != null) return _Runall!!

        _Runall = ImageVector.Builder(
            name = "Runall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
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
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(2f, 2f)
                lineTo(10f, 8f)
                lineTo(2f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF59A869))
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

        return _Runall!!
    }

private var _Runall: ImageVector? = null

