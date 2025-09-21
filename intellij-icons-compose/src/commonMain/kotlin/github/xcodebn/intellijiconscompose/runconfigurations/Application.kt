package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Application: ImageVector
    get() {
        if (_Application != null) return _Application!!

        _Application = ImageVector.Builder(
            name = "Application",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(12f, 2f)
                lineTo(11f, 2f)
                lineTo(1f, 2f)
                lineTo(1f, 9f)
                lineTo(1f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(2f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                close()
                moveTo(3f, 5f)
                lineTo(3f, 12f)
                lineTo(13f, 12f)
                lineTo(13f, 5f)
                lineTo(3f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(12f, 2f)
                    lineTo(11f, 2f)
                    lineTo(1f, 2f)
                    lineTo(1f, 9f)
                    lineTo(1f, 10f)
                    lineTo(0f, 10f)
                    lineTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 2f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(2f, 3f)
                    lineTo(14f, 3f)
                    lineTo(14f, 13f)
                    lineTo(2f, 13f)
                    lineTo(2f, 3f)
                    close()
                    moveTo(3f, 5f)
                    lineTo(3f, 12f)
                    lineTo(13f, 12f)
                    lineTo(13f, 5f)
                    lineTo(3f, 5f)
                    close()
                }
            }
        }.build()

        return _Application!!
    }

private var _Application: ImageVector? = null

