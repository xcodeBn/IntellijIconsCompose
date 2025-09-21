package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunAnything: ImageVector
    get() {
        if (_RunAnything != null) return _RunAnything!!

        _RunAnything = ImageVector.Builder(
            name = "RunAnything",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(0f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 3f)
                lineTo(1f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 3f)
                lineTo(1f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(3f, 4f)
                lineTo(8f, 7f)
                lineTo(3f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(0f, 0f)
                    lineTo(14f, 0f)
                    lineTo(14f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 3f)
                    lineTo(1f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 3f)
                    lineTo(1f, 3f)
                    close()
                }
            }
        }.build()

        return _RunAnything!!
    }

private var _RunAnything: ImageVector? = null

