package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PatchApplied: ImageVector
    get() {
        if (_PatchApplied != null) return _PatchApplied!!

        _PatchApplied = ImageVector.Builder(
            name = "PatchApplied",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 6f)
                lineTo(9f, 10f)
                lineTo(7f, 8f)
                lineTo(3f, 12f)
                lineTo(3f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                lineTo(13f, 1f)
                lineTo(13f, 6f)
                close()
                moveTo(3f, 13f)
                lineTo(5f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 13f)
                close()
                moveTo(7f, 1f)
                lineTo(7f, 5f)
                lineTo(3f, 5f)
                lineTo(7f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(15f, 8f)
                lineTo(16f, 9f)
                lineTo(9f, 16f)
                lineTo(5f, 12f)
                lineTo(7f, 11f)
                lineTo(9f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(13f, 6f)
                    lineTo(9f, 10f)
                    lineTo(7f, 8f)
                    lineTo(3f, 12f)
                    lineTo(3f, 6f)
                    lineTo(8f, 6f)
                    lineTo(8f, 1f)
                    lineTo(13f, 1f)
                    lineTo(13f, 6f)
                    close()
                    moveTo(3f, 13f)
                    lineTo(5f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 13f)
                    close()
                    moveTo(7f, 1f)
                    lineTo(7f, 5f)
                    lineTo(3f, 5f)
                    lineTo(7f, 1f)
                    close()
                }
            }
        }.build()

        return _PatchApplied!!
    }

private var _PatchApplied: ImageVector? = null

